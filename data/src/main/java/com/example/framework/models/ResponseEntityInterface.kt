package com.example.framework.models

interface ResponseEntityInterface<T:Any> {

    fun responseEntity():T
}