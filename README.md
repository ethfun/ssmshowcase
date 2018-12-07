# SSM show case
## Building on top of [spring-mvc-showcase](https://github.com/spring-projects/spring-mvc-showcase) and [mybatis jpetstore-6](https://github.com/mybatis/jpetstore-6)
## Snippets
- [maven exclusions](https://maven.apache.org/guides/introduction/introduction-to-optional-and-excludes-dependencies.html)
- [maven scope: compile(default)/provided/runtime/test/system/import](http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html)
- [classpath vs classpath*](https://docs.spring.io/spring/docs/3.0.x/spring-framework-reference/html/resources.html)
- [/ vs /*  url-pattern](https://stackoverflow.com/questions/4140448/difference-between-and-in-servlet-mapping-url-pattern)
- [committed file ignore change](https://stackoverflow.com/questions/3319479/can-i-git-commit-a-file-and-ignore-its-content-changes)
```
git update-index --assume-unchanged [<file> ...]
To undo and start tracking again (if you forgot what files were untracked, see this question):
git update-index --no-assume-unchanged [<file> ...]
```
- [mvc:annotation-driven-0](https://docs.spring.io/spring/docs/3.0.x/spring-framework-reference/html/mvc.html#mvc-config)
- [mvc:annotation-driven-1](https://stackoverflow.com/questions/28851306/spring-framework-what-is-the-purpose-of-mvcannotation-driven)
- [mvc:annotation-driven-2](https://spring.io/blog/2009/12/21/mvc-simplifications-in-spring-3-0/)

**Loading properties file**
- [How to read values from properties file?](http://stackoverflow.com/questions/9259819/how-to-read-values-from-properties-file)
- [difference-between-web-apps-context-param-and-servlets-init-param](https://stackoverflow.com/questions/18607716/difference-between-web-apps-context-param-and-servlets-init-param)
```xml
<spring>
  <util:properties id="applicationProperties" location="path-to-your-very-long-location" />
  <context:property-placeholder properties-ref="applicationProperties" />
</spring>
```

**web.xml**
- [purpose-of-webapprootkey](https://stackoverflow.com/questions/1867170/purpose-of-webapprootkey)