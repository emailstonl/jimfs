/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.jimfs.internal;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link HeapMemoryDisk} that create a new disk for each byte store created (testing
 * fresh state).
 *
 * @author Colin Decker
 */
@RunWith(JUnit4.class)
public class HeapDiskTest extends AbstractByteStoreTest {

  @Override
  protected ByteStore createByteStore() {
    return new HeapMemoryDisk(4).createByteStore();
  }
}
