/*
 * Copyright (c) 2017 LinkedIn Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.linkedin.restli.server.resources.unstructuredData;


import com.linkedin.common.callback.Callback;
import com.linkedin.restli.server.RoutingException;
import com.linkedin.restli.server.UnstructuredDataWriter;
import com.linkedin.restli.server.annotations.UnstructuredDataWriterParam;
import com.linkedin.restli.server.resources.BaseResource;


/**
 * A version of {@link UnstructuredDataCollectionResource} with callback async interface
 */
public interface UnstructuredDataCollectionResourceAsync<K> extends BaseResource, KeyUnstructuredDataResource<K>
{
  default void get(K key, @UnstructuredDataWriterParam UnstructuredDataWriter writer, Callback<Void> callback)
  {
    throw new RoutingException("'get' is not implemented", 400);
  }
}
