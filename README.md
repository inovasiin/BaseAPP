# BaseAPP

BaseAPP is the  basic application set up for Grails + Rest + GSP Views

## Features

- Rest API
- GSP Views
- GSON Views
- Spring Security

## What to check

### application.groovy

```
[pattern: '/api/login',     access: ['permitAll']],
[pattern: '/api/logout',     access: ['isFullyAuthenticated()']],
```
api/login = The get path that you will be able to get the token for the application

```
grails.plugin.springsecurity.rest.token.storage.jwt.secret='pleaseChangeThisSecretForANewOne'
grails.plugin.springsecurity.rest.logout.endpointUrl = '/api/logout'
grails.plugin.springsecurity.rest.token.validation.useBearerToken = false
grails.plugin.springsecurity.rest.token.validation.headerName = 'X-Api-Token'
grails.plugin.springsecurity.rest.token.storage.memcached.hosts = 'localhost:11211'
grails.plugin.springsecurity.rest.token.storage.memcached.username = ''
grails.plugin.springsecurity.rest.token.storage.memcached.password = ''
grails.plugin.springsecurity.rest.token.storage.memcached.expiration = 86400
```
headerName = Name of the token that has to be used in your calls.



### Bootstrap.groovy

Check the user password and role that is been created.


## How to use.

Check the following post in the Inovasi Blog and you will be able to use it.




## Tech

Boomerang uses a number of open source projects to work properly:

- [Grails 5.0.1](https://grails.org/) - Grails framework.



# Developed By

[Inovasi](https://www,inovasi.in)