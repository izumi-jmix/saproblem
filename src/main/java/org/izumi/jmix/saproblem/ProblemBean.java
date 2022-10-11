package org.izumi.jmix.saproblem;

import javax.annotation.PostConstruct;

import io.jmix.core.security.SystemAuthenticator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Aiden Izumi (aka Flamesson).
 */
//@Component
public class ProblemBean {
    private static final Logger log = LoggerFactory.getLogger(ProblemBean.class);
    private final SystemAuthenticator authenticator;

    @Autowired
    public ProblemBean(SystemAuthenticator authenticator) {
        this.authenticator = authenticator;
    }

    @PostConstruct
    public void init() {
        try {
            authenticator.begin();
            log.info("Some initializing actions");
        } finally {
            authenticator.end();
        }
    }
}
