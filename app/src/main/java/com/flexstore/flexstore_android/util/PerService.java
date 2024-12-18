/**
 * @file PerService.java
 * @author Krisna Pranav
 * @brief Activity Per Services
 * @version 1.0
 * @date 2024-11-25
 *
 * @copyright Copyright (c) 2024 FlexStore Developers, Krisna Pranav
 *
 */

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;


@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PerService {
}