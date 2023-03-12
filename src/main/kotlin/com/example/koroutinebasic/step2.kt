package com.example.koroutinebasic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 새 코루틴은 CoroutineScope 내부에서만 실행될 수 있으며, 이는 코루틴의 lifetime을 제한합니다.
 * 이전 예제에서는 runBlocking 메소드가 해당됩니다.
 *
 * 실제 어플리케이션에서는 많은 코루틴을 실행하며, 구조적 동시성(Structured concurrency)은 코루틴이 손실되고 누수되지 않도록 보장합니다.
 * 외부에서는 모든 자식 코루틴들이 종료될때 까지 종료되지 않으며, 구조적 동시성은 모든 오류가 잘 보고되고 절대 손실되지 않도록 보장합니다.
 *
 * 이전의 launch { } 블록 내부의 코드를 추출하면 suspend라는 키워드가 붙게 됩니다.
 * suspending function은 코루틴 내부에서 일반 함수처럼 실행될 수 있습니다. 차이가 있다면, 다른 suspending function을 사용하여
 * 코루틴의 실행을 일시 중단할 수 있습니다. (여기 예시에서는 delay가 suspend function입니다.)
 *
 * fun -> suspend fun 호출 안됨.
 * suspend fun -> suspend fun 호출 가능
 */

fun main() = runBlocking {
    launch {
        innerLaunchBlock()
    }

    println("Hello")
}

suspend fun innerLaunchBlock() {
    delay(1000L)
    println("World!")
}
