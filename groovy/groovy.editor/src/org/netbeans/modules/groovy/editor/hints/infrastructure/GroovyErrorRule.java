/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.groovy.editor.hints.infrastructure;

import java.util.List;
import java.util.Set;
import org.netbeans.modules.csl.api.Hint;
import org.netbeans.modules.csl.api.Rule.ErrorRule;
import org.netbeans.modules.csl.api.RuleContext;
import org.netbeans.modules.groovy.editor.compiler.error.CompilerErrorID;
import org.netbeans.modules.groovy.editor.compiler.error.GroovyError;

/** 
 * Represents a rule to be run on the Groovy source in case the compiler 
 * issued an error or a warning.
 */
public abstract class GroovyErrorRule implements ErrorRule {

    /** 
     * Get the diagnostic codes this rule should run on
     */
    public abstract Set<CompilerErrorID> getCodes();

    /** 
     * Return possible fixes for a given diagnostic report.
     */
    public abstract void run(RuleContext context, GroovyError error, List<Hint> result);
}
