DB schema name: bonvoyage
DB credentials for the Bon Voyage project:
UN: aaaj
PW: $aaaj?

three users are created for testing. The creation script is in populate.sql.
users data are:
-- ROLE_ADMIN: un: admin123 / pw: admin!23
-- ROLE_RIDER: un: aserahmad / pw: admin!23
-- ROLE_NONE: un: ahmadibrahim / pw: admin!23

Complete programmatic configuration. No web.xml, dispatcher-servlet.xml,
Security-context, applicationContext.
See com.packt.webstore.configuration package for details.

Spring Servlet Container automatically Bootstraps based on discovering of WebApplicationInitializer interface.
See DeploymentDescriptor.java example in above mentioned package.

FinalExamJPASEC is XML version
FEJPASECB is boot version
 