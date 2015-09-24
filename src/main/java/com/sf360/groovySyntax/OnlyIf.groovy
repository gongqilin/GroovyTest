package com.sf360.groovySyntax;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface OnlyIf {
	Class value()

}
