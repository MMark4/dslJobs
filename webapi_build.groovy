job('webapi_build') {
    logRotator(-1, 10)
    scm	{
		github('Saetabis1/ReportSystem','master')
    }
    triggers {
        githubPush()
    }
    steps {
        bat('cd reportsystemwebapi/')
		bat('dotnet build')
    }
    publishers {
        archiveArtifacts('job-dsl-plugin/build/libs/job-dsl.hpi')
    }
}