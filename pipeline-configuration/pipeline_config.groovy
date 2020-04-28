libraries{
    merge = true
    sonarqube
    junit
    jinja2
}
stages{
    continuous_integration{
        build
        static_code_analysis
        junit
        jinja
    }
}
