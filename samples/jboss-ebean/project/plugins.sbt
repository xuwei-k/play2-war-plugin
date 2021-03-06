// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.1-RC1")

resolvers += Resolver.file("Local Ivy Repository", file(Path.userHome.absolutePath+"/.ivy2/local"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.github.play2war" % "play2-war-plugin" % "0.9-SNAPSHOT")