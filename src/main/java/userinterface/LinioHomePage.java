package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.linio.com.pe/")
public class LinioHomePage extends PageObject {
    public static final Target CAMPOPRODUCTOS = Target.the("Campo productos").located(By.xpath("//*[@id=\"navbar\"]/div[2]/div[2]/div[3]/form/div/div/input"));
    public static final Target BOTON_BUSCAR = Target.the("Boton buscar producto").located(By.xpath("//*[@id=\"navbar\"]/div[2]/div[2]/div[3]/form/div/div/div/button"));
    public static final Target PRODUCTO_GAMEBOY = Target.the("Producto gameboy").located(By.xpath("//*[@id=\"catalogue-product-container\"]/div[1]"));
    public static final Target AGREGAR_AL_CARRITO = Target.the("Agregar al carrito").located(By.xpath("//*[@id=\"buy-now\"]"));
    public static final Target OPCIONES = Target.the("Opciones").located(By.xpath("//*[@id=\"product-options\"]/label[1]"));
    public static final Target VALIDACION = Target.the("Tu producto se agregó al carrito").located(By.className("//span[@class='added-product'][text()='Tu producto se agregó al carrito']"));
}