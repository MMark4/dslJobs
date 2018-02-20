job('webapi_build') {
    logRotator(-1, 10)
    scm	{
		github('Saetabis1/dotnetSeleniumTemplate','master')
    }
    triggers {
        githubPush()
    }
    steps {
		batchFile('dotnet build')
    }
    publishers {
			mailer('marca.manu2@gmail.com', true, true)
    }
}