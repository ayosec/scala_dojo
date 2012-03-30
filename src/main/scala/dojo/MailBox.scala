package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match {
    case Ping => Pong
    case Pong => Ping
  }

  def receive(msg: Any) = msg match {
    case m: PingPongMessage => handleMsg(m)
    case "stop"             => "stopped"
    case ("echo", a: Any)   => a
  }

}
