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

package yapion.datatypes.pcollections;

import org.pcollections.PStack;
import yapion.hierarchy.types.YAPIONObject;
import yapion.serializing.api.SerializerObjectInterface;
import yapion.serializing.data.DeserializeData;
import yapion.serializing.data.SerializeData;

public class PStackSerializer implements SerializerObjectInterface<PStack> {

    @Override
    public Class<PStack> type() {
        return PStack.class;
    }

    @Override
    public boolean isInterface() {
        return true;
    }

    @Override
    public YAPIONObject serialize(SerializeData<PStack> serializeData) {
        return null;
    }

    @Override
    public PStack deserialize(DeserializeData<YAPIONObject> deserializeData) {
        return null;
    }
}
