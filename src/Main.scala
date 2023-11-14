@main
def main() =
  println("Hello, world!")

def error(): Unit =
  val i = 1;
  if (1 < i)
    return;
  error();


case class Person(
                   name: String)


class PersonP(
               name: String
             )

