/*
 * Copyright 2019,2020,2021 yoyosource
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package yapion.datatypes;

import yapion.datatypes.pcollections.*;
import yapion.serializing.api.YAPIONSerializerRegistrator;

public class PCollectionsSerializerRegistrator implements YAPIONSerializerRegistrator {

    @Override
    public void register() {
        register(new PBagSerializer());
        register(new PMapSerializer());
        register(new POrderedSetSerializer());
        register(new PQueueSerializer());
        register(new PSetSerializer());
        register(new PStackSerializer());
        register(new PVectorSerializer());
    }

}
