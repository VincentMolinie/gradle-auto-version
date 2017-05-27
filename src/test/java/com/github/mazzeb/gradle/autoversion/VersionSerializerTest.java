package com.github.mazzeb.gradle.autoversion;

import org.gradle.internal.impldep.com.google.gson.JsonElement;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static com.github.mazzeb.gradle.autoversion.Version.versionBuilder;

public class VersionSerializerTest {

    VersionSerializer testee;

    @Before
    public void setUp() throws Exception {
        testee = new VersionSerializer();
    }

    @Test
    public void shouldSerializeVersion() throws Exception {
        Version version = versionBuilder()
                .withMajor(2L)
                .withMinor(4L)
                .withPatch(1L)
                .withSnapshot(false)
                .build();
        JsonElement serialize = testee.serialize(version, null, null);

        JSONAssert.assertEquals(serialize.toString(), "{\n" +
                "  \"major\": 2,\n" +
                "  \"minor\": 4,\n" +
                "  \"patch\": 1,\n" +
                "  \"snapshot\": false\n" +
                "}", false);
    }
}