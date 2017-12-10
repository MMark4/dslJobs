job('webapi_build') {
    logRotator(-1, 10)
    scm	{
		github('Saetabis1/ReportSystem','master')
    }
    triggers {
        githubPush()
    }
    steps {
        batchFile('cd reportsystemwebapi\')
		batchFile('dotnet build')
    }
    publishers {
        archiveArtifacts('job-dsl-plugin/build/libs/job-dsl.hpi')
    }
}