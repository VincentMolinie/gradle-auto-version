/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'mbargman' at '2/27/17 9:35 AM' with Gradle 3.1
 *
 * @author mbargman, @date 2/27/17 9:35 AM
 */


import org.gradle.api.*
import org.gradle.api.artifacts.ConfigurationContainer
import org.gradle.api.artifacts.dsl.ArtifactHandler
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.component.SoftwareComponentContainer
import org.gradle.api.file.*
import org.gradle.api.initialization.dsl.ScriptHandler
import org.gradle.api.invocation.Gradle
import org.gradle.api.logging.Logger
import org.gradle.api.logging.LoggingManager
import org.gradle.api.plugins.*
import org.gradle.api.resources.ResourceHandler
import org.gradle.api.tasks.TaskContainer
import org.gradle.api.tasks.WorkResult
import org.gradle.process.ExecResult
import org.gradle.process.ExecSpec
import org.gradle.process.JavaExecSpec
import spock.lang.Specification

class AutoVersionTest extends Specification{

    def "some Project is not Null"() {
        setup:
        AutoVersion lib = new AutoVersion()
        def project = someProject()
        when:
        lib.apply(project)
        then:
        someProject() != null
    }

    private static someProject = { ->
        new Project() {
            @Override
            Project getRootProject() {
                return null
            }

            @Override
            File getRootDir() {
                return null
            }

            @Override
            File getBuildDir() {
                return null
            }

            @Override
            void setBuildDir(Object o) {

            }

            @Override
            File getBuildFile() {
                return null
            }

            @Override
            Project getParent() {
                return null
            }

            @Override
            String getName() {
                return null
            }

            @Override
            String getDescription() {
                return null
            }

            @Override
            void setDescription(String s) {

            }

            @Override
            Object getGroup() {
                return null
            }

            @Override
            void setGroup(Object o) {

            }

            @Override
            Object getVersion() {
                return null
            }

            @Override
            void setVersion(Object o) {

            }

            @Override
            Object getStatus() {
                return null
            }

            @Override
            void setStatus(Object o) {

            }

            @Override
            Map<String, Project> getChildProjects() {
                return null
            }

            @Override
            Project getProject() {
                return null
            }

            @Override
            Set<Project> getAllprojects() {
                return null
            }

            @Override
            Set<Project> getSubprojects() {
                return null
            }

            @Override
            Task task(String s) throws InvalidUserDataException {
                return null
            }

            @Override
            Task task(Map<String, ?> map, String s) throws InvalidUserDataException {
                return null
            }

            @Override
            Task task(Map<String, ?> map, String s, Closure closure) {
                return null
            }

            @Override
            Task task(String s, Closure closure) {
                return null
            }

            @Override
            String getPath() {
                return null
            }

            @Override
            List<String> getDefaultTasks() {
                return null
            }

            @Override
            void setDefaultTasks(List<String> list) {

            }

            @Override
            void defaultTasks(String... strings) {

            }

            @Override
            Project evaluationDependsOn(String s) throws UnknownProjectException {
                return null
            }

            @Override
            void evaluationDependsOnChildren() {

            }

            @Override
            Project findProject(String s) {
                return null
            }

            @Override
            Project project(String s) throws UnknownProjectException {
                return null
            }

            @Override
            Project project(String s, Closure closure) {
                return null
            }

            @Override
            Map<Project, Set<Task>> getAllTasks(boolean b) {
                return null
            }

            @Override
            Set<Task> getTasksByName(String s, boolean b) {
                return null
            }

            @Override
            File getProjectDir() {
                return null
            }

            @Override
            File file(Object o) {
                return null
            }

            @Override
            File file(Object o, PathValidation pathValidation) throws InvalidUserDataException {
                return null
            }

            @Override
            URI uri(Object o) {
                return null
            }

            @Override
            String relativePath(Object o) {
                return null
            }

            @Override
            ConfigurableFileCollection files(Object... objects) {
                return null
            }

            @Override
            ConfigurableFileCollection files(Object o, Closure closure) {
                return null
            }

            @Override
            ConfigurableFileTree fileTree(Object o) {
                return null
            }

            @Override
            ConfigurableFileTree fileTree(Object o, Closure closure) {
                return null
            }

            @Override
            ConfigurableFileTree fileTree(Map<String, ?> map) {
                return null
            }

            @Override
            FileTree zipTree(Object o) {
                return null
            }

            @Override
            FileTree tarTree(Object o) {
                return null
            }

            @Override
            File mkdir(Object o) {
                return null
            }

            @Override
            boolean delete(Object... objects) {
                return false
            }

            @Override
            WorkResult delete(Action<? super DeleteSpec> action) {
                return null
            }

            @Override
            ExecResult javaexec(Closure closure) {
                return null
            }

            @Override
            ExecResult javaexec(Action<? super JavaExecSpec> action) {
                return null
            }

            @Override
            ExecResult exec(Closure closure) {
                return null
            }

            @Override
            ExecResult exec(Action<? super ExecSpec> action) {
                return null
            }

            @Override
            String absoluteProjectPath(String s) {
                return null
            }

            @Override
            String relativeProjectPath(String s) {
                return null
            }

            @Override
            AntBuilder getAnt() {
                return null
            }

            @Override
            AntBuilder createAntBuilder() {
                return null
            }

            @Override
            AntBuilder ant(Closure closure) {
                return null
            }

            @Override
            ConfigurationContainer getConfigurations() {
                return null
            }

            @Override
            void configurations(Closure closure) {

            }

            @Override
            ArtifactHandler getArtifacts() {
                return null
            }

            @Override
            void artifacts(Closure closure) {

            }

            @Override
            Convention getConvention() {
                return null
            }

            @Override
            int depthCompare(Project project) {
                return 0
            }

            @Override
            int getDepth() {
                return 0
            }

            @Override
            TaskContainer getTasks() {
                return null
            }

            @Override
            void subprojects(Action<? super Project> action) {

            }

            @Override
            void subprojects(Closure closure) {

            }

            @Override
            void allprojects(Action<? super Project> action) {

            }

            @Override
            void allprojects(Closure closure) {

            }

            @Override
            void beforeEvaluate(Action<? super Project> action) {

            }

            @Override
            void afterEvaluate(Action<? super Project> action) {

            }

            @Override
            void beforeEvaluate(Closure closure) {

            }

            @Override
            void afterEvaluate(Closure closure) {

            }

            @Override
            boolean hasProperty(String s) {
                return false
            }

            @Override
            Map<String, ?> getProperties() {
                return null
            }

            @Override
            Object property(String s) throws MissingPropertyException {
                return null
            }

            @Override
            Object findProperty(String s) {
                return null
            }

            @Override
            Logger getLogger() {
                return null
            }

            @Override
            Gradle getGradle() {
                return null
            }

            @Override
            LoggingManager getLogging() {
                return null
            }

            @Override
            Object configure(Object o, Closure closure) {
                return null
            }

            @Override
            Iterable<?> configure(Iterable<?> iterable, Closure closure) {
                return null
            }

            @Override
            def <T> Iterable<T> configure(Iterable<T> iterable, Action<? super T> action) {
                return null
            }

            @Override
            RepositoryHandler getRepositories() {
                return null
            }

            @Override
            void repositories(Closure closure) {

            }

            @Override
            DependencyHandler getDependencies() {
                return null
            }

            @Override
            void dependencies(Closure closure) {

            }

            @Override
            ScriptHandler getBuildscript() {
                return null
            }

            @Override
            void buildscript(Closure closure) {

            }

            @Override
            WorkResult copy(Closure closure) {
                return null
            }

            @Override
            CopySpec copySpec(Closure closure) {
                return null
            }

            @Override
            WorkResult copy(Action<? super CopySpec> action) {
                return null
            }

            @Override
            CopySpec copySpec(Action<? super CopySpec> action) {
                return null
            }

            @Override
            CopySpec copySpec() {
                return null
            }

            @Override
            ProjectState getState() {
                return null
            }

            @Override
            def <T> NamedDomainObjectContainer<T> container(Class<T> aClass) {
                return null
            }

            @Override
            def <T> NamedDomainObjectContainer<T> container(Class<T> aClass, NamedDomainObjectFactory<T> namedDomainObjectFactory) {
                return null
            }

            @Override
            def <T> NamedDomainObjectContainer<T> container(Class<T> aClass, Closure closure) {
                return null
            }

            @Override
            ExtensionContainer getExtensions() {
                return null
            }

            @Override
            ResourceHandler getResources() {
                return null
            }

            @Override
            SoftwareComponentContainer getComponents() {
                return null
            }

            @Override
            int compareTo(Project o) {
                return 0
            }

            @Override
            PluginContainer getPlugins() {
                return null
            }

            @Override
            void apply(Closure closure) {

            }

            @Override
            void apply(Action<? super ObjectConfigurationAction> action) {

            }

            @Override
            void apply(Map<String, ?> map) {

            }

            @Override
            PluginManager getPluginManager() {
                return null
            }
        }
    }


}