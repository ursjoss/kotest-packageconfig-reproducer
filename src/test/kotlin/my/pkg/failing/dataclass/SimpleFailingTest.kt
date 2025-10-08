package my.pkg.failing.dataclass

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SimpleFailingTest : FunSpec({

    context("With a data class PackageConfig in the prod source set") {
        test("the test instantiation should succeed but fails") {
            true shouldBe true
        }
    }
})
