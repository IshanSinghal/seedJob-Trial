pipelineJob("abc") {
    description("Test for specific job")
    triggers {
        cron('H * * * *')
    }
}
