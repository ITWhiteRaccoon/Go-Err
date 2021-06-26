package com.github.itwhiteraccoon.goerr.services

import com.github.itwhiteraccoon.goerr.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
