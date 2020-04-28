libraries{
    merge = true
    sonarqube
    ansible
    junit
    jinja2
}
stages{
    continuous_integration{
        build
        static_code_analysis
        junit
        jinja2
    }
}
application_environments{
    dev{
        ip_address = [ "34.70.70.84" ]
    }
    qa{
        long_name = "Quality"
        ip_addresses = [ "104.154.81.224" ]
    }
}
