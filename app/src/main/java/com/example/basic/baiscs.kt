package com.example.basic

fun main(){
    println("안녕하세요. Shoppi에 오신것을 환영합니다.")
    println("쇼핑몰 계속 이용하시려면 이름을 입력하세요")

    val name = readLine()
    println("""
        감사합니다. 반갑습니다. $name 님
        원하시는 카테고리를 입력해주세요. 
        ========================================
    """.trimIndent())



}