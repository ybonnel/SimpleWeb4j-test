/*
 * Copyright 2013- Yan Bonnel
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.ybonnel.simpleweb4j.test;

import fr.ybonnel.simpleweb4j.test.phantomjs.PhantomJsTest;

import java.util.Random;

public class SimpleWeb4jTest extends PhantomJsTest {

    private int port;

    public SimpleWeb4jTest() {
        Random random = new Random();
        port = Integer.getInteger("test.http.port", random.nextInt(10000) + 10000);
    }

    public int getPort() {
        return port;
    }

    @Override
    protected String defaultUrl() {
        return "http://localhost:" + port;
    }
}
