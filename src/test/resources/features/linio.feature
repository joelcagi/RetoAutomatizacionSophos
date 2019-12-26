# language:es

  Característica: Gestionar producto Linio
    Como usuario
    quiero ingresar a la pagina de Linio
    para consultar un producto y agregarlo al carrito de compras

  Escenario: agregar producto al carrito
    Dado que usuario quiere ingresar a pagina de linio
    Cuando consulta un producto gameboy
    Y lo agrega al carrito de compras
    Entonces el deberia ver que Tu producto se agregó al carrito
