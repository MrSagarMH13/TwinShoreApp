/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.servicebean;

import com.i2rtech.twinshoreapp.auth.Authentication;
import com.i2rtech.twinshoreapp.auth.LoggedInUser;
import com.i2rtech.twinshoreapp.constant.AppMsgConstant;
import com.i2rtech.twinshoreapp.constant.QueryConstant;
import com.i2rtech.twinshoreapp.dto.LoginDTO;
import com.i2rtech.twinshoreapp.entity.DoctorStaff;
import com.i2rtech.twinshoreapp.entity.LoginMaster;
import com.i2rtech.twinshoreapp.service.LoginService;
import java.math.BigInteger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author mrsagar
 */
@Stateless
public class LoginServiceBean extends Authentication implements LoginService {

    @PersistenceContext
    EntityManager em;

    private LoggedInUser user;

    Logger logger = LoggerFactory.getLogger(LoginServiceBean.class);

    @Override
    public LoginDTO getUserDetails(String userName, String password, HttpServletRequest request) {
        logger.info(LoginServiceBean.class + " getUserDetails() SRART ");
        LoginDTO loginDTO = new LoginDTO();
        try {
            Query query = em.createQuery(QueryConstant.GET_LOGIN_MASTER)
                    .setParameter("userName", new BigInteger(userName))
                    .setParameter("password", password);
            LoginMaster loginMaster = (LoginMaster) query.getSingleResult();
            DoctorStaff doctorStaff = em.find(DoctorStaff.class, loginMaster.getPersonID());

            LoggedInUser loggedInUser = new LoggedInUser();
            loggedInUser.setUserID(doctorStaff.getDoctorStaffID());
            loggedInUser.setUserName(doctorStaff.getFullName());
            loggedInUser.setEmailID(doctorStaff.getEmailIDPrimary());
            loggedInUser.setSmsPhonePrimary(doctorStaff.getSMSPhonePrimary().toString());
            loggedInUser.setUserRole(doctorStaff.getDoctorStaffRole());
            setLoggedInUser(loggedInUser);
            loginDTO.setMessageID(AppMsgConstant.SUCCESS_ID);
        } catch (NoResultException nre) {
            loginDTO.setMessageID(AppMsgConstant.FAILURE_ID);
        } catch (Exception e) {
            logger.error(LoginServiceBean.class + " getUserDetails() ERROR : " + e.toString());
        }
        logger.info(LoginServiceBean.class + " getUserDetails() END ");
        return loginDTO;
    }

    @Override
    public LoggedInUser getLoggedInUser() {
        if (user != null) {
            return user;
        }
        return new LoggedInUser();
    }

    private void setLoggedInUser(LoggedInUser loggedInUser) {
        this.user = loggedInUser;
    }
}
