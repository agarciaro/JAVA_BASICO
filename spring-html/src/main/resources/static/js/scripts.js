var gr = 0;
var valores = [true, 5, "hola", 2];
		function mostrarImagen(src, ancho, alto, alt) {
			var imagen = document.createElement("img");
			imagen.src = src;
			imagen.width = ancho;
			imagen.height = alto;
			imagen.alt = alt;
			document.body.appendChild(imagen);
// 			window.alert("HOLA");
		}
		
		function rotaRect(){
			var c = document.getElementById("myCanvas");
// 			var gr = 0;
			var ctx = c.getContext("2d");

			setTimeout(() => {
				console.log("ROTARECT " + gr);
				ctx.translate(40, 20);
				ctx.rotate(gr * Math.PI /180);
				ctx.fillRect(40, 20, 100, 50);
				gr+=20;
			}, 500);
			
		}
		
		function loadJSON(url, data, callback){
			var xhr = new XMLHttpRequest();
			xhr.open("GET", url, true);
			xhr.onload = function() {
				callback(JSON.parse(xhr.responseText)); // {id:1}, {"id", 1}
			}
			xhr.send();
			var o = {
				id:1,
				nombre:"Aitor"
			};
			console.log(o['id']);
			
// 			console.log('1' + 2 + 3);
// 			console.log(1 + 2 + '3');
			
			var i = 'Aitor';
			i = 5*30;
			
			console.log(i)

			var text;
			var valores = [2, 3, 4, 5];
			
			forEach(valores, function(replace) {
				text = text.replace(replace[0], replace[1]);
			});
		}