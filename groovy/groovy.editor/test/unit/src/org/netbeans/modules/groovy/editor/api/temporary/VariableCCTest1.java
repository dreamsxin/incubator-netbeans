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
package org.netbeans.modules.groovy.editor.api.temporary;

import java.util.Set;
import org.netbeans.modules.groovy.editor.api.completion.GroovyCCTestBase;

/**
 * Just temporary test (see README.txt for more details). Original test location is {@link VariablesCompletionTest}
 *
 * @author Martin Janicek
 */
public class VariableCCTest1 extends GroovyCCTestBase {

    public VariableCCTest1(String testName) {
        super(testName);
    }

    @Override
    protected String getTestType() {
        return "variables";
    }

    @Override
    protected Set<String> additionalSourceClassPath() {
        Set<String> sources = super.additionalSourceClassPath();
        sources.add(getBasicSourcePath());
        return sources;
    }

    public void testVariables3_1() throws Exception {
        checkCompletion(BASE + "Variables3.groovy", "println \"Hello $name!\" ^", true);
    }
}
