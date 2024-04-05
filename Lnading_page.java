<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Our Bookstore</title>
    <link rel="stylesheet" href="styles1.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f8f8;
        }

        .header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }

        .main-nav ul {
            list-style-type: none;
            padding: 0;
        }

        .main-nav ul li {
            display: inline;
            margin-right: 20px;
        }

        .main-nav ul li a {
            color: #fff;
            text-decoration: none;
        }

        .main-nav ul li.search-bar input[type="text"] {
            padding: 5px;
            border: none;
            border-radius: 5px;
            width: 150px;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }

        .content {
            text-align: center;
            padding: 40px 0;
        }

        .content h1 {
            font-size: 36px;
            margin-bottom: 20px;
            animation: fadeInUp 1s ease-out;
        }

        .content p {
            font-size: 18px;
            color: #666;
            animation: fadeInUp 1s ease-out;
        }

        .book-container {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-wrap: wrap;
            padding: 20px;
        }

        .book {
            margin: 10px;
            text-align: center;
            background-color: #fff;
            padding: 10px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            animation: zoomIn 0.5s ease-out;
        }

        .book img {
            max-width: 200px;
            max-height: 300px;
            margin-bottom: 10px;
            animation: fadeIn 0.5s ease-out, scaleIn 0.5s ease-out;
        }

        .book a {
            display: block;
            color: #333;
            text-decoration: none;
            font-weight: bold;
            animation: fadeInUp 1s ease-out;
        }

        h2 {
            text-align: center;
            margin-top: 40px;
            font-size: 24px;
            animation: fadeInUp 1s ease-out;
        }

        /* Animation keyframes */
        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }

        @keyframes fadeInUp {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        @keyframes zoomIn {
            from {
                transform: scale(0.5);
            }
            to {
                transform: scale(1);
            }
        }

        @keyframes scaleIn {
            from {
                transform: scale(0.8);
            }
            to {
                transform: scale(1);
            }
        }
    </style>
</head>
<body>

<div class="header">
    <h1>Welcome to Our Bookstore</h1>
    <nav class="main-nav">
        <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Services</a></li>
            <li><a href="#">Contact</a></li>
            <li class="search-bar"><input type="text" placeholder="Search"></li>
        </ul>
    </nav>
</div>

<div class="container">
    <div class="content">
        <h1>Explore Our Collection</h1>
        <p>Welcome to our bookstore! Discover a wide range of fiction and non-fiction books.</p>
    </div>

    <h2>Thriller</h2>
    <div class="book-container">
        <div class="book">
            <img src="./download (1).jpeg" alt="Book Cover">
            <img src="./download (3).jpeg">
            <img src="./download (2).jpeg">
            <img src="./download (4).jpeg">
            <a href="#">Taiako Turai</a>
        </div>
        <!-- Repeat similar structure for other books -->
    </div>

    <h2>Adventure</h2>
    <div class="book-container">
        <img src="./download (2).jpeg">
        <img src="./download (3).jpeg">
        <img src="./download (2).jpeg">
        <img src="./download (5).jpeg">
    </div>

    <h2>Technical</h2>
    <div class="book-container">
        <img src="./download (3).jpeg">
        <img src="./download (2).jpeg">
        <img src="./download (4).jpeg">
        <img src="./download (5).jpeg">
    </div>
</div>

</body>
</html>
