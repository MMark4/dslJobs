job('webapi-build') {
    logRotator(-1, 10)
    scm	{
		github('Saetabis1/ReportSystem','master')
    }
    triggers {
        githubPush()
    }
    steps {
        powershell('cd reportsystemwebapi')
		powershell('dotnet build')
    }
    publishers {
        archiveArtifacts('job-dsl-plugin/build/libs/job-dsl.hpi')
    }
}