package com.github.mazzeb.gradle.autoversion;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;


public class VersionDeserializerTest {

    VersionDeserializer testee;

    @Before
    public void setUp() throws Exception {
        testee = new VersionDeserializer();
    }

    @Test
    public void shouldDeserialize() throws Exception {
        JsonObject given = new JsonObject();
        given.add("major", new JsonPrimitive(1));
        given.add("minor", new JsonPrimitive(5));
        given.add("patch", new JsonPrimitive(3));
        given.add("label", new JsonPrimitive("someLabel"));

        Version version = testee.deserialize(given, null, null);

        assertThat(version.getMajor(), is(1L));
        assertThat(version.getMinor(), is(5L));
        assertThat(version.getPatch(), is(3L));
        assertThat(version.getLabel(), is("someLabel"));
    }

    @Test
    public void shouldDeserializeincompleteJson() throws Exception {
        JsonObject given = new JsonObject();
        given.add("major", new JsonPrimitive(2));
        given.add("patch", new JsonPrimitive(1));

        Version version = testee.deserialize(given, null, null);

        assertThat(version.getMajor(), is(2L));
        assertThat(version.getMinor(), is(0L));
        assertThat(version.getPatch(), is(1L));
        assertThat(version.getLabel(), is(nullValue()));
    }
}