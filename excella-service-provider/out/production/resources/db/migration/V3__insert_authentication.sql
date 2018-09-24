INSERT INTO OAUTH_CLIENT_DETAILS(CLIENT_ID, RESOURCE_IDS, CLIENT_SECRET, SCOPE, AUTHORIZED_GRANT_TYPES, AUTHORITIES, ACCESS_TOKEN_VALIDITY, REFRESH_TOKEN_VALIDITY)
    VALUES ('div4-security-oauth2-read-write-client', 'resource-server-rest-api',
    /*div4-security-oauth2-read-write-client-password1234*/'$2a$04$CgYM.cUxee5UMJYfugFIseqd2zXqJTvxfQFAtQTAI0H5B0tVeRWLa',
    'read,write', 'password,authorization_code,refresh_token,implicit', 'USER', 10800, 2592000);
