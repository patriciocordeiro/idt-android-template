package com.github.patriciocordeiro.idtandroidtemplate.services

import com.intellij.openapi.project.Project
import com.github.patriciocordeiro.idtandroidtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
