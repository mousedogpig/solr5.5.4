/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.solr.cloud.rule;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

/**
 *
 */
public abstract class Snitch {
  static Set<Class> WELL_KNOWN_SNITCHES = ImmutableSet.<Class>of(ImplicitSnitch.class);


  public abstract void getTags(String solrNode, Set<String> requestedTags, SnitchContext ctx);

  public abstract boolean isKnownTag(String tag);

}
