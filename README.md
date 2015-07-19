# Javarush-Eclipse plugin
Eclipse plugin for JavaRush project homework.

You can install the plugin from the [update site](https://svrtm.github.io/update)
(there's also an archive of the site for offline installation). After installing,
go to *Window->Preferences->Javarush-Eclipse Plugin* to create a project for
homework, if you have not created.

# building
You can generate an update site using [Maven](http://maven.apache.org/):

    mvn clean verify

This will create an update site in
_javarush.eclipse.site/target/repository_.
