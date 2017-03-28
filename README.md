

####需要另一个view的id或者父容器即ConstraintLayout
* app:layout_constraintTop_toTopOf="@id/view  | parent"
* app:layout_constraintTop_toBottomOf="@id/view | parent"
* app:layout_constraintRight_toLeftOf="@id/view | parent"
* app:layout_constraintRight_toRightOf="@id/view | parent"
* app:layout_constraintBottom_toBottomOf="@id/view | parent"
* app:layout_constraintBottom_toTopOf="@id/view | parent"
* app:layout_constraintLeft_toLeftOf="@id/view | parent"
* app:layout_constraintLeft_toRightOf="@id/view | parent"
* app:layout_constraintStart_toStartOf="@id/view | parent"
* app:layout_constraintStart_toEndOf="@id/view | parent"
* app:layout_constraintEnd_toStartOf="@id/view | parent"
* app:layout_constraintEnd_toEndOf="@id/view | parent"


* app:layout_constraintVertical_bias="0.0 ~ 正无穷"	(大于等于 1.0 则为1.0)
* app:layout_constraintHorizontal_bias="0.0 ~ 正无穷"	(大于等于 1.0 则为1.0)

####宽高比(约束宽度或者高度为另一方的x/x，默认为宽度)
* app:layout_constraintDimensionRatio="1:1"

* app:layout_constraintDimensionRatio="H,16:9"  * app:layout_constraintDimensionRatio="W,16:9"

###Guide(引导线)
* layout_constraintGuide_begin="100dp"
* layout_constraintGuide_end="100dp"
* layout_constraintGuide_percent="0.0~正无穷"
注意使用layout_constraintGuide_percent，
layout_constraintGuide_begin和layout_constraintGuide_end都会失效

####忽略Gone
* layout_goneMarginStart
* layout_goneMarginEnd
* layout_goneMarginLeft
* layout_goneMarginTop
* layout_goneMarginRight
* layout_goneMarginBottom
为什么没有layout_goneMargin忽略全部呢？

####参考
* [谷歌开发文档](https://developer.android.google.cn/reference/android/support/constraint/ConstraintLayout.html#DimensionConstraints)

* #####掘金翻译计划
	* [ConstraintLayout (这到底是什么)](https://juejin.im/entry/589dc5382f301e0069c3791a?utm_source=gold-miner&utm_medium=readme&utm_campaign=github)
	* [[译] ConstraintLayout ( 这到底是什么 ) (小贴士及小技巧) 第二部分](https://juejin.im/entry/58aaedd5ac502e006974e868?utm_source=gold-miner&utm_medium=readme&utm_campaign=github)
	* [Constraint Layout 动画 | 动态 Constraint | 用 Java 实现的 UI（这到底是什么）[第三部分]](https://juejin.im/entry/58b2fd59570c350069704265?utm_source=gold-miner&utm_medium=readme&utm_campaign=github)
	* [ConstraintLayout 可视化 [Design] 编辑器（这到底是什么）[第四部分]](https://juejin.im/entry/58b0e0381b69e60058a49455?utm_source=gold-miner&utm_medium=readme&utm_campaign=github)



