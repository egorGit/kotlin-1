// "Create expected function in common module testModule_Common" "true"
// SHOULD_FAIL_WITH: You cannot create the expect declaration from:,fun foo(some: List&lt;Some&gt;){...}
// DISABLE-ERRORS

class Some

actual fun <caret>foo(some: List<Some>) {}