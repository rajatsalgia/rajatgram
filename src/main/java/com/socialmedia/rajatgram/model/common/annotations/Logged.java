package com.socialmedia.rajatgram.model.common.annotations;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

// if nothing defined, it will be marker annotation like @Deprecated @Override
@Target({ElementType.METHOD}) // where to use this
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
@interface Logged {
}
