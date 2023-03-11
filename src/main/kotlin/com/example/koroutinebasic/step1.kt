package com.example.koroutinebasic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * 코루틴은 일시 중단 가능한 계산의 인스턴스입니다. 나머지 코드와 동시에 작동하는 코드 블록을
 * 실행한다는 점에서 스레드와 개념적으로 유사하나, 특정 스레드에 바인딩되지는 않습니다.
 * 한 스레드에서 코루틴 실행을 일시 중단했다가, 다른 스레드에서 실행될 수 있는 특징이 있습니다.
 * 코루틴은 경량 스레드로 생각될 수도 있지만, 스레드와 많이 다른 특징이 있습니다.
 *
 *
 * launch : 코루틴 빌더로 나머지 코드와 동시에 새 코루틴을 시작하며, 독립적으로 실행된다는 특징이 있습니다.
 * delay : 코루틴을 특정 시간동안 일시중지합니다.
 * runBlocking : 비코루틴 코드 - 코루틴 코드를 묶어줍니다. runBlocking의 경우 호출동안 블로킹됩니다.
 */
fun main() = runBlocking {
    launch {
        delay(1000L)
        println("World!")
    }

    println("Hello")
}
