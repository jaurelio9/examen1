/*2.Mostrar el número de ventas de cada producto, ordenado de más a menos ventas.*/
select productos.nombre,count(productos.nombre) as numero_ventas from venta 
inner join productos  on venta.producto =productos.producto
group by productos.nombre order by numero_ventas desc


/* 3.	Obtener un informe completo de ventas, indicando el nombre del cajero que realizo la venta, 
nombre y precios de los productos vendidos, y el piso en el que se encuentra la máquina registradora donde se realizó la venta.*/
select cajeros.nomapels as nombreCajero,productos.nombre as Prodcuto,
productos.precio,maquinas_registradoras.maquina,maquinas_registradoras.piso from venta 
inner join cajeros on venta.cajero =cajeros.cajero
inner join productos  on venta.producto =productos.producto
inner join maquinas_registradoras on venta.maquina = maquinas_registradoras.maquina

/* 4.	Obtener las ventas totales realizadas en cada piso.*/
select maquinas_registradoras.piso,count(maquinas_registradoras.piso) as numero_ventas_por_piso, sum(productos.precio) as venta_total
from venta 
inner join maquinas_registradoras on venta.maquina = maquinas_registradoras.maquina
inner join productos  on venta.producto =productos.producto
group by maquinas_registradoras.piso order by numero_ventas_por_piso desc

/*5.	Obtener el código y nombre de cada cajero junto con el importe total de sus ventas.*/
select cajeros.cajero as codigo_cajero, cajeros.nomapels as nombreCajero, count(cajeros.cajero) as total_ventas,
sum(productos.precio) as Importe_total_ventas from venta 
inner join cajeros on venta.cajero =cajeros.cajero
inner join productos  on venta.producto =productos.producto
group by cajeros.cajero order by Importe_total_ventas desc

    
/* 6.	Obtener el código y nombre de aquellos cajeros que hayan 
realizado ventas en pisos cuyas ventas totales sean inferiores a los 5000 pesos.*/
select cajeros.cajero, cajeros.nomapels as nombreCajero from venta 
inner join cajeros on venta.cajero =cajeros.cajero
inner join maquinas_registradoras on venta.maquina = maquinas_registradoras.maquina	
where maquinas_registradoras.piso in(	
select maquinas_registradoras.piso
from venta 
inner join maquinas_registradoras on venta.maquina = maquinas_registradoras.maquina
inner join productos  on venta.producto =productos.producto
 group by maquinas_registradoras.piso 
 having sum(productos.precio)< '$5000')
 group by cajeros.cajero