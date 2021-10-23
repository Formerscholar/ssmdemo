<html>
<body>
<h2>Hello World!</h2>

<script src="./js/jquery.min.js"></script>
<script>
    $(function () {
        $(document).ready(function () {
            $.getJSON("/api/test", function (res) {
                console.log(res)
                $("h2").text(res.title)
            });
        })
    })
</script>
</body>
</html>