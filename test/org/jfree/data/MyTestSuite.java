package org.jfree.data;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	CombineTest.class,
	ConstrainTest.class,
	ContainsTest.class,
	DataUtilitiesTest.class,
	EqualsTest.class,
	ExpandTest.class,
	expandToIndcludeTest.class,
	GetCentralValueTest.class,
	GetLowerBoundTest.class,
	GetUpperBoundTest.class,
	IntersectsTest.class,
	LengthTest.class,
	RangeTest.class,
	Shift.class,
	ShiftNoZeroCrossingTest.class,
	toStringTest.class
})
public class MyTestSuite {}