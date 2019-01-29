fun components(vararg names: String) = include(*names.map { "common-$it" }.toTypedArray())

components("all", "extension", "collection", "concurrent")
