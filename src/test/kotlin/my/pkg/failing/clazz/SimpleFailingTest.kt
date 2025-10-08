package my.pkg.failing.clazz

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SimpleFailingTest : FunSpec({

    context("With a regular class PackageConfig in the prod source set") {
        test("the test instantiation should succeed but fails") {
            true shouldBe true
        }
    }
})
