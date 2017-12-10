job('webapi_build') {
    logRotator(-1, 10)
    scm	{
		github('Saetabis1/reportsystemwebapi','master')
    }
    triggers {
        githubPush()
    }
    steps {
		bat('dotnet build')
    }
    publishers {
        archiveArtifacts('job-dsl-plugin/build/libs/job-dsl.hpi')
    }
}