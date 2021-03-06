/*
   Copyright 2016 Jörg Prante

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.xbib.marc;

/**
 * A MARC listener with empty methods. Useful for extending.
 */
public class MarcFieldAdapter implements  MarcListener {
    @Override
    public void beginCollection() {
    }

    @Override
    public void beginRecord(String format, String type) {
    }

    @Override
    public void leader(String label) {
    }

    @Override
    public void field(MarcField field) {
    }

    @Override
    public void endRecord() {
    }

    @Override
    public void endCollection() {
    }
}
