# Minimal http4s with ZIO example

Here I tried to do as little as possible to get http4s running using ZIO instead of cats-effect IO

## Step 1

Follow the [standard http4s instructions](https://http4s.org/v0.20/) and get the quickstart app running:

```bash
sbt -sbt-version 1.2.8 new http4s/http4s.g8 -b 0.20
```

You can see the result in this commit:

https://github.com/apauley/http4s-zio-quickstart/commit/f0846efcbe8c212748586de727047f00ed37d042

## Step 2

Instantiate the Quickstart Server with a ZIO Task instead of the default cats-effect IO:

https://github.com/apauley/http4s-zio-quickstart/commit/e678d3b829230cde9195c4447683d791b7c2373b
