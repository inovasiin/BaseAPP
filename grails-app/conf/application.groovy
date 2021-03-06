

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.password.hash.iterations = 1
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.userLookup.userDomainClassName = 'in.inovasi.security.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'in.inovasi.security.UserRole'
grails.plugin.springsecurity.authority.className = 'in.inovasi.security.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],
	[pattern: '/index',          access: ['isFullyAuthenticated()']],
	[pattern: '/index.gsp',      access: ['isFullyAuthenticated()']],
	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],
	[pattern: '/api/login',     access: ['permitAll']],
    [pattern: '/api/logout',     access: ['isFullyAuthenticated()']],
    [pattern: '/**',             access: ['isFullyAuthenticated()']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]
grails.plugin.springsecurity.filterChain.chainMap = [
    [pattern: '/api/**', filters:'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter'],
  [pattern: '/**', filters:'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter']
]

grails.plugin.springsecurity.rest.token.storage.jwt.secret='pleaseChangeThisSecretForANewOne'
grails.plugin.springsecurity.rest.logout.endpointUrl = '/api/logout'
grails.plugin.springsecurity.rest.token.validation.useBearerToken = false
grails.plugin.springsecurity.rest.token.validation.headerName = 'X-Api-Token'
grails.plugin.springsecurity.rest.token.storage.memcached.expiration = 86400
