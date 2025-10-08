package my.pkg.working

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SimplePassingTest : FunSpec({

    context("With no class called PackageConfig in the prod source set") {
        test("the test instantiation succeeds and a simple boolean comparison passes") {
            true shouldBe true
        }
    }
})
